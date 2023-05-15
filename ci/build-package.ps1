
param(
    [Parameter(Mandatory=$true)]
    [string]$RepoName,
    [string]$ProjectDir = ".",
    [string]$Name,
    [Parameter(Mandatory=$true)]
    [Hashtable]$Options
)

# Retrieve the values from the Options parameter
$Keys = $Options['Keys']
$Version = $Options['Version']

# Path to this repository
$RepoPath = [IO.Path]::Combine($pwd, $RepoName)

# Path to where the binaries should be located in order to include them in the packages
$BinariesPath = "$RepoPath/device-detection.hash.engine.on-premise/target/classes/"

# Path to where the dll files are downloaded for all the platfoms
$PackageFilesPath = "$RepoPath/package-files/"

# Create a directory for binary files from which they will be uploaded
# as artifacts.
New-Item -path $BinariesPath -ItemType Directory -Force 

# Copy files over from target to package-files folder
$Files = Get-ChildItem -Path $PackageFilesPath/* -Recurse -Include "*.dll", "*.so", "*.dylib"
foreach($file in $Files){
    Copy-Item -Path $file -Destination "$BinariesPath/$($file.Name)"
}

./java/build-package.ps1 -RepoName $RepoName -ProjectDir $ProjectDir -Name $Name -Version $Version -ExtraArgs "-DskipNativeBuild=true" -JavaGpgKeyPassphrase $Keys['JavaGpgKeyPassphrase'] -CodeSigningCert $Keys['CodeSigningCert'] -JavaPGP $Keys['JavaPGP'] -CodeSigningCertAlias $Keys['CodeSigningCertAlias'] -CodeSigningCertPassword $Keys['CodeSigningCertPassword'] -MavenSettings $Keys['MavenSettings'] 


exit $LASTEXITCODE
