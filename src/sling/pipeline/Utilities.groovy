//Utility class
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}


  def sampleUtility() {
    steps.sh "echo 'Hello world'"

    //Running Pwd command.
    steps.sh "pwd"
  }


  def sampleNewUtility() {

    steps.sh 'echo "App version is : ${APP_VERSION}"'

    steps.sh 'echo "temp param is : ${Temp}"'
  }

}