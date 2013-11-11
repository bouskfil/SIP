
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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Subject],List[Teacher],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjectForm: Form[Subject], teachers: List[Teacher]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.6*/title/*6.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.15*/("""
        Přidat předmět
    """)))};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "signup")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""

    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Subjects.add)/*12.47*/ {_display_(Seq[Any](format.raw/*12.49*/("""

        <fieldset>
            <legend>Informace o předmětu</legend>

            """),_display_(Seq[Any](/*17.14*/inputText(
                subjectForm("name"),
                '_label -> "Název předmětu",
                '_help -> "Zadejte jméno předmětu.",
                '_error -> subjectForm.globalError
            ))),format.raw/*22.14*/("""

            """),_display_(Seq[Any](/*24.14*/inputText(
                subjectForm("katedra"),
                '_label -> "Katedra",
                '_help -> "Zadejte katedru."
            ))),format.raw/*28.14*/("""



                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Garant&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="garant">
                <option selected value="-- Zadejte garanta --"></option>
            """),_display_(Seq[Any](/*35.14*/for(teacher <- teachers) yield /*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""
                <option value=""""),_display_(Seq[Any](/*36.33*/teacher/*36.40*/.name)),format.raw/*36.45*/("""">"""),_display_(Seq[Any](/*36.48*/teacher/*36.55*/.name)),format.raw/*36.60*/("""</option>
            """)))})),format.raw/*37.14*/("""
            </select>




        </fieldset>


        <div class="actions">
            <input type="submit" class="btn primary" value="Vytvořit">
            <a href=""""),_display_(Seq[Any](/*48.23*/routes/*48.29*/.Subjects.blank)),format.raw/*48.44*/("""" class="btn">Zrušit</a>
        </div>

    """)))})),format.raw/*51.6*/("""

""")))})))}
    }
    
    def render(subjectForm:Form[Subject],teachers:List[Teacher]): play.api.templates.HtmlFormat.Appendable = apply(subjectForm,teachers)
    
    def f:((Form[Subject],List[Teacher]) => play.api.templates.HtmlFormat.Appendable) = (subjectForm,teachers) => apply(subjectForm,teachers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 12:46:03 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/form.scala.html
                    HASH: bceba8e8fa3c586941ccded552e3db6ab5605099
                    MATRIX: 803->1|983->113|996->118|1080->122|1148->54|1176->107|1207->151|1245->154|1281->181|1321->183|1363->190|1378->196|1422->231|1462->233|1583->318|1815->528|1866->543|2035->690|2375->994|2415->1018|2455->1020|2524->1053|2540->1060|2567->1065|2606->1068|2622->1075|2649->1080|2704->1103|2912->1275|2927->1281|2964->1296|3041->1342
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|53->22|55->24|59->28|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|79->48|79->48|79->48|82->51
                    -- GENERATED --
                */
            