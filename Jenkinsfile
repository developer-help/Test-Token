node {
    // This displays colors using the 'xterm' ansi color map.
    def pipeline = "p1"
    stage("Hello") {
        def green = "green"
        echo "Hello" + " ${getGreen()} World"
     

        if("${pipeline}" == "p1" ) {
            echo "call pipeline p1"
        }
        else if("${pipeline}" == "p5" ) {
            echo "call pipeline ${pipeline}"
        }
        else {
            echo "default ${pipeline} is called"
        }
    }
}


public def getGreen() {
    return 'green'
}
