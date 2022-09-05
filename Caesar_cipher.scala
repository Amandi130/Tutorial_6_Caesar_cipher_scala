object CeasarCipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val inputText = scala.io.StdIn.readLine("Secret Message: ")
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    print("Enter the Encryp-0/Decrypt-1: ")
    val num=scala.io.StdIn.readInt()

    def Encrypt()={
        inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});
    }

    def Decrypt()={
        inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x - shift+26) % alphabet.size)
			} 
	});
    }

    if(num==0){
        print("Encryption="+Encrypt())
    }
    else{
        print("Decryption="+Decrypt())
    }
}