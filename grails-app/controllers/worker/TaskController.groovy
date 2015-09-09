package worker

import grails.converters.JSON

class TaskController {

    def list(Integer count) {
    	if(!count){
    		count=10
    	}
    	List<Task> taskList = []
    	(1..count).each{Integer index->
    		taskList.add(new Task(name: "Task${index}", priority: "Prioirty${index}"))
    	}
    	render(taskList as JSON)
     }
}
