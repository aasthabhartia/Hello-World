package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWebApplication._


@Controller
@EnableAutoConfiguration
class SampleController {

  @RequestMapping("/")
  @ResponseBody
  def home(): String = "Hello World!"

}