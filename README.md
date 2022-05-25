# Java Ransomware PoC

The following is a Java-based PoC Ransomware software with a basic GUI (Java Swing) set to recover your encrypted files based on a static 128-bit encryption/decryption key. This demo program uses a simple SKC approach, which stands for `Secret Key Cryptography`. Basically, this type of encryption uses a single key for encryption/decryption processes, this is also defined as `symmetric encryption`.

For this particular approach, in order to recover from professional/production scenarios, the recovery key should be inside the ransomware, this makes this type of attack easy to mitigate.

The `CriticalPathList.add(System.getProperty("user.home") + "/ransomware-test");` instruction sets the expected directory for sandboxing ransom files. Each process with append a `.encrypted` and `.decrypted` file format as long as the process is goes through. The `CryptoUtils.java` class is the responsible for handling the encrypt and decrypt logic.

This PoC was tested on a Windows environment only.

## Apache Common IO Library

One of the dependencies of the program is the `commons-io-2.6.jar`, which is a library of utilities to assist with developing IO functionality.

## Build from CLI

In order to run the program you just run

`javac -cp .;commons-io-2.6.jar Ransomware.java`

Then:

`java -cp .;common-io-2.6.jar Ransomware`

The `-cp` is the `classpath` argument. Check docs for more details.

You can also spot the `build.txt` for more details.

## Credits

 - [David E Lares](https://twitter.com/davdlares)

## License

 - [MIT](https://opensource.org/licenses/MIT)
