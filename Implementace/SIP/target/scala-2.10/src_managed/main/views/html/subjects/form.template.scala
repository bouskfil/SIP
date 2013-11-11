
package views.html.subjects

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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjectForm: Form[Subject]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import scala._

def /*7.6*/title/*7.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.15*/("""
        Přidat předmět
    """)))};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*6.1*/("""
    """),format.raw/*9.6*/("""

"""),_display_(Seq[Any](/*11.2*/main(title, nav = "signup")/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

    """),_display_(Seq[Any](/*13.6*/helper/*13.12*/.form(action = routes.SubjectController.add)/*13.56*/ {_display_(Seq[Any](format.raw/*13.58*/("""

        <fieldset>
            <legend>Informace o předmětu</legend>

            """),_display_(Seq[Any](/*18.14*/inputText(
                subjectForm("name"),
                '_label -> "Název předmětu",
                '_help -> "Zadejte jméno předmětu.",
                '_error -> subjectForm.globalError
            ))),format.raw/*23.14*/("""

            """),_display_(Seq[Any](/*25.14*/inputText(
                subjectForm("katedra"),
                '_label -> "Katedra",
                '_help -> "Zadejte katedru."
            ))),format.raw/*29.14*/("""

            """),_display_(Seq[Any](/*31.14*/select(
                subjectForm("garant"),
                options = options(Teacher.getAllNames),
                '_default -> "--- Vyberte garanta ---",
                '_label -> "Garant",
                '_help -> "Vyberte garanta."
            ))),format.raw/*37.14*/("""
            """),_display_(Seq[Any](/*38.14*/textarea(
                subjectForm("information"),
                '_label -> "Informace",
                '_help -> "Zadejte informace o předmětu."
            ))),format.raw/*42.14*/("""



        </fieldset>


        <div class="actions">
            <input type="submit" class="btn primary" value="Vytvořit">
            <a href=""""),_display_(Seq[Any](/*51.23*/routes/*51.29*/.SubjectController.blank)),format.raw/*51.53*/("""" class="btn">Zrušit</a>
        </div>

    """)))})),format.raw/*54.6*/("""

""")))})))}
    }
    
    def render(subjectForm:Form[Subject]): play.api.templates.HtmlFormat.Appendable = apply(subjectForm)
    
    def f:((Form[Subject]) => play.api.templates.HtmlFormat.Appendable) = (subjectForm) => apply(subjectForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 22:51:56 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/form.scala.html
                    HASH: c75c1363337f273a12f01226dcd7360290d4eafd
                    MATRIX: 789->1|960->104|973->109|1057->113|1125->29|1153->98|1184->142|1222->145|1258->172|1298->174|1340->181|1355->187|1408->231|1448->233|1569->318|1801->528|1852->543|2021->690|2072->705|2348->959|2398->973|2585->1138|2770->1287|2785->1293|2831->1317|2908->1363
                    LINES: 26->1|33->7|33->7|35->7|38->1|40->6|41->9|43->11|43->11|43->11|45->13|45->13|45->13|45->13|50->18|55->23|57->25|61->29|63->31|69->37|70->38|74->42|83->51|83->51|83->51|86->54
                    -- GENERATED --
                */
            