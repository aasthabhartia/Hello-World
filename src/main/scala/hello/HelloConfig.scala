package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWebApplication._
//remove if not needed
import scala.collection.JavaConversions._

@Controller
@EnableAutoConfiguration
class HelloConfig {

  @RequestMapping("/")
  @ResponseBody
  def home(): String = "Hello World!"
}