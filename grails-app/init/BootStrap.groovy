import demo.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: 'Jeff', lastName: 'Brown').save()
        new Person(firstName: 'Betsy', lastName: 'Brown').save()
    }
    def destroy = {
    }
}
