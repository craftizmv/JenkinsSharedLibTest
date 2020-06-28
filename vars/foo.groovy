

def info() {
    steps.sh 'echo "App version is : ${APP_VERSION}"'

    steps.sh 'echo "temp param is : ${Temp}"'
}