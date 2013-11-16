
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Školní Informační Portál"))/*1.40*/ {_display_(Seq[Any](format.raw/*1.42*/("""

    <p>
    <img id="logo" src=""""),_display_(Seq[Any](/*4.26*/routes/*4.32*/.Assets.at("images/logo.png"))),format.raw/*4.61*/("""">
    </p>
    <h1 style="text-align: center">Vítejte v aplikaci Školní Informační Portál!</h1>

""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 11:54:13 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/index.scala.html
                    HASH: dc1aa5217bc8000800c2f2aede37b65fb16b7811
                    MATRIX: 864->1|910->39|949->41|1019->76|1033->82|1083->111
                    LINES: 29->1|29->1|29->1|32->4|32->4|32->4
                    -- GENERATED --
                */
            