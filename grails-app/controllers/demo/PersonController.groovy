package demo

import grails.rest.RestfulController

class PersonController extends RestfulController<Person> {

    static responseFormats = ['json', 'xml']

    PersonController() {
        super(Person)
    }

    // customizations go here...
}
