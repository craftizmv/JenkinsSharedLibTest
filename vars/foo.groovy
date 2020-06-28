

def info() {

    println("This is inside foo info")

    echo "This is inside foo info"

    steps.sh 'echo "App version is : ${APP_VERSION}"'

    steps.sh 'echo "temp param is : ${Temp}"'
}