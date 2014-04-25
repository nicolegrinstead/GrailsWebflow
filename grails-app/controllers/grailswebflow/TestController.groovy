package grailswebflow


class TestController {

    def stepFlow = {
        stepOne {
            println "got in here?"
            on("submitOne"){ TestCommand command ->
                flow.command = command
                println "step one commad is ${command.dump()}"
            }.to "stepTwo"
        }
        stepTwo {
            on("submitTwo"){
                bindData(flow.command, params)
                println "step two command is ${flow.command.dump()}"
            }.to "finalStep"
        }
        finalStep {
        }
    }
}
