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

    //Looks like println does not work in case of this kind of class.
    println("This is using println method")

    steps.sh 'echo "App version is : ${APP_VERSION}"'

    steps.sh 'echo "temp param is : ${Temp}"'
  }

}