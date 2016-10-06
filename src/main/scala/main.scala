import com.roundeights.hasher.Implicits._
import scala.language.postfixOps

object main extends App {

  def hashmeSha256(json: String) = {

    // Generate hashes
    json.sha256

    // Print each hex encoded hash
    println("SHA256: " + json.sha256.hex)

    // Compare the original value to each hashed value
    // and print the boolean result
    println("SHA256 Matches: " + (json.sha256 hash = json.sha256))

  }
}