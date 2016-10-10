import com.roundeights.hasher.Implicits._
import scala.language.postfixOps

object main extends App {

    val publisherId = "publisherId"
    val bidRequestId = "bidRequestId"
    val exchange = "exchange"
    val lineId = "lineId"
    val ip = "ip"
    val city = "city"
    val os = "os"
    val connectionType = "connectionType"
 /*
  def hashmeSha256(json: String) = json match {
    case `publisherId` => publisherId.sha256                                          // Generate hashes
      println ("SHA256: " + publisherId.sha256.hex)                                   // Print each hex encoded hash
      println("SHA256 Matches: " + (publisherId.sha256 hash = publisherId.sha256) )   // Compare the original value to each hashed value
                                                                                      // and print the boolean result

    case `bidRequestId` => bidRequestId.sha256
      println ("SHA256: " + bidRequestId.sha256.hex)
      println("SHA256 Matches: " + (bidRequestId.sha256 hash = bidRequestId.sha256) )

    case `exchange` => exchange.sha256
      println ("SHA256: " + exchange.sha256.hex)
      println("SHA256 Matches: " + (exchange.sha256 hash = exchange.sha256) )

    case `ip` => ip.sha256
      println ("SHA256: " + ip.sha256.hex)
      println("SHA256 Matches: " + (ip.sha256 hash = ip.sha256) )

    case `city` => city.sha256
      println ("SHA256: " + city.sha256.hex)
      println("SHA256 Matches: " + (city.sha256 hash = city.sha256) )

    case `os` => os.sha256
      println ("SHA256: " + os.sha256.hex)
      println("SHA256 Matches: " + (os.sha256 hash = os.sha256) )

    case `connectionType` => connectionType.sha256
      println ("SHA256: " + connectionType.sha256.hex)
      println("SHA256 Matches: " + (connectionType.sha256 hash = connectionType.sha256) )

    case `lineId` => lineId.sha256
      println ("SHA256: " + lineId.sha256.hex)
      println("SHA256 Matches: " + (lineId.sha256 hash = lineId.sha256) )
  }


*/

def hashMeSha256(json: String) = {

  // Generate a few hashes
  val sha256 = json.sha256


  // Print each hex encoded hash
  println( "SHA1: " + sha256.hex )
  
}




}