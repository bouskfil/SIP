
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Školní informační portál</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>

        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index)),format.raw/*18.69*/("""">ŠIP</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "SubjectController")))),format.raw/*20.80*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.SubjectController.blank)),format.raw/*21.69*/("""">Předměty</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*23.37*/("active".when(nav == "schedule")))),format.raw/*23.71*/("""">
                            <a href="#">Rozvrh</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*26.37*/("active".when(nav == "studyresults")))),format.raw/*26.75*/("""">
                            <a href="#">Studijní výsledky</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*29.37*/("active".when(nav == "exam")))),format.raw/*29.67*/("""">
                            <a href="#">Zápočty a zkoušky</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*32.37*/("active".when(nav == "homework")))),format.raw/*32.71*/("""">
                            <a href="#">Domácí úkoly</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*35.37*/("active".when(nav == "other")))),format.raw/*35.68*/("""">
                            <a href="#">Ostatní</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*38.37*/("active".when(nav == "signout")))),format.raw/*38.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*39.39*/routes/*39.45*/.Application.logout)),format.raw/*39.64*/("""">Odhlásit se</a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="content">
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*50.26*/title)),format.raw/*50.31*/("""</h1>
                </div>
                <div class="row">
                    <div class="span14">
                    """),_display_(Seq[Any](/*54.22*/content)),format.raw/*54.29*/("""
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
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 23:04:26 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/main.scala.html
                    HASH: 8562b3f9ea3f715446000d81615abe94879aa5a2
                    MATRIX: 783->1|923->47|1096->185|1110->191|1170->230|1261->286|1275->292|1330->326|1427->387|1442->393|1496->425|1557->450|1572->456|1639->501|1878->704|1893->710|1933->728|2052->811|2117->854|2194->895|2209->901|2255->925|2372->1006|2428->1040|2584->1160|2644->1198|2811->1329|2863->1359|3030->1490|3086->1524|3248->1650|3301->1681|3458->1802|3513->1835|3590->1876|3605->1882|3646->1901|3948->2167|3975->2172|4136->2297|4165->2304
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|54->26|54->26|57->29|57->29|60->32|60->32|63->35|63->35|66->38|66->38|67->39|67->39|67->39|78->50|78->50|82->54|82->54
                    -- GENERATED --
                */
            