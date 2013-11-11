
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>Školní informační portál</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.54*/routes/*6.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*15.45*/routes/*15.51*/.Application.index())),format.raw/*15.71*/("""">ŠIP</a>
                    <ul class="nav">
                    </ul>
                </div>
            </div>
        </div>
        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>Přihlášení</h1>
                </div>

                <div class="row">
                    <div class="span14">
                    """),_display_(Seq[Any](/*31.22*/helper/*31.28*/.form(routes.Application.authenticate)/*31.66*/ {_display_(Seq[Any](format.raw/*31.68*/("""
                        <h3>Zadejte údaje</h3>

                        <p>
                            <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*35.90*/form("email")/*35.103*/.value)),format.raw/*35.109*/("""">
                        </p>
                        <p>
                            <input type="password" name="password" placeholder="Password">
                        </p>
                        <p>
                            <button type="submit" class="btn primary">Přihlásit se</button>
                        </p>
                    """)))})),format.raw/*43.22*/("""
                        """),_display_(Seq[Any](/*44.26*/if(form.hasGlobalErrors)/*44.50*/ {_display_(Seq[Any](format.raw/*44.52*/("""
                            <p class="error">
                            """),_display_(Seq[Any](/*46.30*/form/*46.34*/.globalError.message)),format.raw/*46.54*/("""
                            </p>
                        """)))})),format.raw/*48.26*/("""
                        """),_display_(Seq[Any](/*49.26*/if(flash.contains("success"))/*49.55*/ {_display_(Seq[Any](format.raw/*49.57*/("""
                            <p class="success">
                            """),_display_(Seq[Any](/*51.30*/flash/*51.35*/.get("success"))),format.raw/*51.50*/("""
                            </p>
                        """)))})),format.raw/*53.26*/("""
                    </div>
                </div>

            </div>

            <footer>
                <p>
                    ve vývoji
                </p>
            </footer>

        </div>

    </body>
</html>"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 23:03:30 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/login.scala.html
                    HASH: 780de974a8bfb3a02a5eb84924293bb595aaaaba
                    MATRIX: 791->1|916->32|1072->153|1086->159|1146->198|1237->254|1251->260|1306->294|1402->355|1416->361|1469->393|1529->418|1543->424|1609->469|1847->671|1862->677|1904->697|2340->1097|2355->1103|2402->1141|2442->1143|2644->1309|2667->1322|2696->1328|3078->1678|3140->1704|3173->1728|3213->1730|3325->1806|3338->1810|3380->1830|3471->1889|3533->1915|3571->1944|3611->1946|3725->2024|3739->2029|3776->2044|3867->2103
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|59->31|59->31|59->31|59->31|63->35|63->35|63->35|71->43|72->44|72->44|72->44|74->46|74->46|74->46|76->48|77->49|77->49|77->49|79->51|79->51|79->51|81->53
                    -- GENERATED --
                */
            