# Errors
## SecurityException: BC provider not installed
- When _BouncyCastle_ provider is not found and you're trying do do things like:  
  `JceOpenSSLPKCS8DecryptorProviderBuilder().setProvider("BC").build(password);`  
  you might have a problem and this seems to be something to check before all:  
  https://stackoverflow.com/questions/19318582/securityexception-bc-provider-not-installed/19319830
