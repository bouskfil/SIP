// @SOURCE:/Users/MacBook/Dropbox/FEL/05_SI/SIP_play/conf/routes
// @HASH:67b2d32728e4a9c5c7bef8b4f4ec0e1c43490e7d
// @DATE:Mon Nov 11 11:53:44 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSubjectController {
    

// @LINE:16
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:18
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "subject/create")
}
                                                

// @LINE:15
def edit(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/create")
}
                                                

// @LINE:14
def save(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/edited/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:17
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "subject")
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSubjectController {
    

// @LINE:16
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:18
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/create"})
      }
   """
)
                        

// @LINE:15
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.edit",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/create"})
      }
   """
)
                        

// @LINE:14
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/edited/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SubjectController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject"})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSubjectController {
    

// @LINE:16
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.delete(id), HandlerDef(this, "controllers.SubjectController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """subject/delete/$id<[^/]+>""")
)
                      

// @LINE:18
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.create(), HandlerDef(this, "controllers.SubjectController", "create", Seq(), "GET", """""", _prefix + """subject/create""")
)
                      

// @LINE:15
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.edit(id), HandlerDef(this, "controllers.SubjectController", "edit", Seq(classOf[Long]), "POST", """""", _prefix + """subject/edit/$id<[^/]+>""")
)
                      

// @LINE:13
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.add(), HandlerDef(this, "controllers.SubjectController", "add", Seq(), "POST", """""", _prefix + """subject/create""")
)
                      

// @LINE:14
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.save(id), HandlerDef(this, "controllers.SubjectController", "save", Seq(classOf[Long]), "POST", """""", _prefix + """subject/edited/$id<[^/]+>""")
)
                      

// @LINE:17
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SubjectController.blank(), HandlerDef(this, "controllers.SubjectController", "blank", Seq(), "GET", """""", _prefix + """subject""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    