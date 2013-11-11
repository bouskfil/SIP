
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
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">ŠIP</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "subjects")))),format.raw/*20.71*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.Subjects.blank())),format.raw/*21.62*/("""">Předměty</a>
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
                            <a href=""""),_display_(Seq[Any](/*39.39*/routes/*39.45*/.Application.logout())),format.raw/*39.66*/("""">Odhlásit se</a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*52.26*/title)),format.raw/*52.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                    """),_display_(Seq[Any](/*57.22*/content)),format.raw/*57.29*/("""
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
                    DATE: Sun Nov 10 15:50:46 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/main.scala.html
                    HASH: 0863540db7a696ba532826e0b82e58a2a45d4408
                    MATRIX: 783->1|923->47|1096->185|1110->191|1170->230|1261->286|1275->292|1330->326|1427->387|1442->393|1496->425|1557->450|1572->456|1639->501|1878->704|1893->710|1935->730|2054->813|2110->847|2187->888|2202->894|2241->911|2358->992|2414->1026|2570->1146|2630->1184|2797->1315|2849->1345|3016->1476|3072->1510|3234->1636|3287->1667|3444->1788|3499->1821|3576->1862|3591->1868|3634->1889|3938->2157|3965->2162|4127->2288|4156->2295
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|54->26|54->26|57->29|57->29|60->32|60->32|63->35|63->35|66->38|66->38|67->39|67->39|67->39|80->52|80->52|85->57|85->57
                    -- GENERATED --
                */
            