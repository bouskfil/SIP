// @SOURCE:/Users/MacBook/Dropbox/FEL/05_SI/SIP_play/conf/routes
// @HASH:67b2d32728e4a9c5c7bef8b4f4ec0e1c43490e7d
// @DATE:Mon Nov 11 11:53:44 CET 2013


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
private[this] lazy val controllers_SubjectController_add4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/create"))))
        

// @LINE:14
private[this] lazy val controllers_SubjectController_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/edited/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_SubjectController_edit6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_SubjectController_delete7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_SubjectController_blank8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject"))))
        

// @LINE:18
private[this] lazy val controllers_SubjectController_create9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/create"))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/create""","""controllers.SubjectController.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/edited/$id<[^/]+>""","""controllers.SubjectController.save(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/edit/$id<[^/]+>""","""controllers.SubjectController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/delete/$id<[^/]+>""","""controllers.SubjectController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject""","""controllers.SubjectController.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/create""","""controllers.SubjectController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_SubjectController_add4(params) => {
   call { 
        invokeHandler(controllers.SubjectController.add(), HandlerDef(this, "controllers.SubjectController", "add", Nil,"POST", """""", Routes.prefix + """subject/create"""))
   }
}
        

// @LINE:14
case controllers_SubjectController_save5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SubjectController.save(id), HandlerDef(this, "controllers.SubjectController", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """subject/edited/$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_SubjectController_edit6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SubjectController.edit(id), HandlerDef(this, "controllers.SubjectController", "edit", Seq(classOf[Long]),"POST", """""", Routes.prefix + """subject/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_SubjectController_delete7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SubjectController.delete(id), HandlerDef(this, "controllers.SubjectController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """subject/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_SubjectController_blank8(params) => {
   call { 
        invokeHandler(controllers.SubjectController.blank(), HandlerDef(this, "controllers.SubjectController", "blank", Nil,"GET", """""", Routes.prefix + """subject"""))
   }
}
        

// @LINE:18
case controllers_SubjectController_create9(params) => {
   call { 
        invokeHandler(controllers.SubjectController.create(), HandlerDef(this, "controllers.SubjectController", "create", Nil,"GET", """""", Routes.prefix + """subject/create"""))
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
     