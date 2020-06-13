//Utility class
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def sampleUtility() {
    steps.sh "echo 'Hello world'"
  }
}