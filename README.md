# Java Ransomware PoC

The following is a PoC Ransomware software with a basic GUI display set to recover your encrypted files based on a static 128-bit encryption/decryption key.

This type of program uses a simple SKC approach, this stands for `Secret Key Cryptography`. Basically, in a few words, this encryption process uses a single key for encryption/decryption processes, this is also defined as symmetric encryption.

For this particular approach, in order to recover from professional/production scenarios, the keys should be inside the ransomware, and for that reason, this type of attack can be easy to mitigate

This PoC was tested on a Windows environment.

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
