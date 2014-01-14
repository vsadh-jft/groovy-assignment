import javax.print.DocFlavor

/**
 * Created by vivekmaster146 on 14/1/14.
 */
class filefind {
    public static void main(String[] args) {
      def directoryName = "/home/vivekmaster146"
        println "enter name of file to be searched in home directory"
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

        def filename = br.readLine()
        def filePattern = ~/${filename}/
        def directory = new File(directoryName)
        if (!directory.isDirectory())
        {
            println "The provided directory name ${directoryName} is NOT a directory."

        }

       File f = new File(filename)
        if(!f.exists())
        {
            println "File does not exist"

        }

        def findFilenameClosure =
                {
                    if (filePattern.matcher(it.name).find())
                    {
                        println "\t${it.name} (size ${it.size()})"
                        String fileContents = new File(directoryName+ "/" + it.name).text
                        println fileContents

                    }
                }
        directory.eachFileRecurse(findFilenameClosure)
    }
}
