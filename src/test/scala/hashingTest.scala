import java.nio.ByteBuffer
import java.nio.file.{Files, Paths}

import org.scalatest.WordSpec

import scala.language.implicitConversions
import com.roundeights.hasher.Implicits._
import io.circe.syntax._
import io.circe.generic.auto._
import io.circe._

import scala.language.postfixOps



class hashingTest extends WordSpec {

  implicit def magiccast(path: String) : ByteBuffer = ByteBuffer.wrap(Files.readAllBytes(Paths.get(getClass.getResource(path).toURI)))

  val hashMe = "Some String"
  val sha1 = hashMe.sha1
  val hashJson =
    """
      |{"appOrSite":"app","bidfloor":0.28,"cats":"IAB24,IAB9,IAB9-23,photography,social_networking",
      |"city":"Saint-laurent-blangy","connectionType":2,"exchange":"mopub", "id":"dd8048ce-776c-49c0-b187-efbaea028115","ip":"78.200.141.1",
      |"lineId":"9044e701-a476-47b3-a6c2-434482212e34","media":"banner","os":"iOS", "price":3.71,"publisherId":"95df5d30a25311e295fa123138070049", "size":[320,480],
      |"timestamp":1.466380953E9,"ua":"Mozilla/5.0 (iPod touch; CPU iPhone OS 9_2_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Mobile/13D15",
      |"bidRequestId":"dd8048ce-776c-49c0-b187-efbaea028115","impid":"1","type":"CLICK","clicked":true}
      |
    """.
      stripMargin

  def sha1Generator(a: String) = a.sha1

/*
  "The hashing" should {
    "be able to encrypt values" in {

      main.parseEvent(hashJson)

    }
  }

  "The parser" should {
    "be able to parse a JSON" in {

      val jsonOuError = main.parseEvent("/event2.json")

      jsonOuError.recover{
        case e => println(e)
      }

      jsonOuError.foreach(e=>println(e.asJson))

    }
  }
  */

  "The parser" should {
    "be able to parse a JSON" in {

      main.hashMeSha256(hashJson)
    }


  }
}
