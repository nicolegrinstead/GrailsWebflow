package grailswebflow

/**
 * Created with IntelliJ IDEA.
 * User: Nicole
 * Date: 4/25/14
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */

//Commands must be serializable to be saved in the flow scope
class TestCommand implements Serializable {
    String fieldOne
    String fieldTwo
}
