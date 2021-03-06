class ModernizrGrailsPlugin {
    // the plugin version
    def version = "2.7.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Modernizr for Grails" // Headline display name of the plugin
    def author = "Simon Kenyon"
    def authorEmail = "simon@koala.ie"
    def description = '''\
Plugin that provides the JavaScript library Modernizr. Modernizr helps you build the next generation of HTML5 and CSS3-powered websites.
It integrates nicely with the resources plugin. Based on an older version by Konstantinos Kostarellis.
'''

    // URL to the plugin's documentation - for previous version
    def documentation = "http://grails.org/plugin/modernizr"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "The Koala Computer Company Limited", url: "http://koala.ie/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Simon Kenyon", email: "simon@koala.ie" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GITHUB", url: "https://github.com/simonckenyon/grails-modernizr/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/simonckenyon/grails-modernizr" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
