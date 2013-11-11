// @SOURCE:/Users/MacBook/Dropbox/FEL/05_SI/SIP_play/conf/routes
// @HASH:18a0ebd28a496c066bc2427b86a43ed85ce0a86a
// @DATE:Sun Nov 10 15:41:51 CET 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Subjects_add4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/create"))))
        

// @LINE:14
private[this] lazy val controllers_Subjects_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:15
private[this] lazy val controllers_Subjects_delete6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:16
private[this] lazy val controllers_Subjects_edit7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:17
private[this] lazy val controllers_Subjects_blank8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subjects"))))
        

// @LINE:18
private[this] lazy val controllers_Subjects_blankCreate9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subjects/create"))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/create""","""controllers.Subjects.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/$id<[^/]+>/edit""","""controllers.Subjects.save(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""","""controllers.Subjects.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/edit""","""controllers.Subjects.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subjects""","""controllers.Subjects.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subjects/create""","""controllers.Subjects.blankCreate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_logout2(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:9
case controllers_Application_authenticate3(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Subjects_add4(params) => {
   call { 
        invokeHandler(controllers.Subjects.add(), HandlerDef(this, "controllers.Subjects", "add", Nil,"POST", """""", Routes.prefix + """subject/create"""))
   }
}
        

// @LINE:14
case controllers_Subjects_save5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Subjects.save(id), HandlerDef(this, "controllers.Subjects", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """subject/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:15
case controllers_Subjects_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Subjects.delete(id), HandlerDef(this, "controllers.Subjects", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tasks/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:16
case controllers_Subjects_edit7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Subjects.edit(id), HandlerDef(this, "controllers.Subjects", "edit", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tasks/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:17
case controllers_Subjects_blank8(params) => {
   call { 
        invokeHandler(controllers.Subjects.blank(), HandlerDef(this, "controllers.Subjects", "blank", Nil,"GET", """""", Routes.prefix + """subjects"""))
   }
}
        

// @LINE:18
case controllers_Subjects_blankCreate9(params) => {
   call { 
        invokeHandler(controllers.Subjects.blankCreate(), HandlerDef(this, "controllers.Subjects", "blankCreate", Nil,"GET", """""", Routes.prefix + """subjects/create"""))
   }
}
        

// @LINE:22
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     