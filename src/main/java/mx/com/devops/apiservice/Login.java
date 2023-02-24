package mx.com.devops.apiservice;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class Login.
 */
@SpringBootApplication
@RestController
public class Login {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Login.class, args);
	}

	/**
	 * Display message.
	 *
	 * @return the message
	 */
	@RequestMapping("/login")
    @ResponseBody
    public Message displayMessage() {
        return new Message();
    }

    /**
     * The Class Message.
     */
    static class Message {
        
        /** The content. */
        private String content = "Esta es la prueba de login 2.0: " + LocalDateTime.now();

        /**
         * Gets the content.
         *
         * @return the content
         */
        public String getContent() {
            return content;
        }

        /**
         * Sets the content.
         *
         * @param content the new content
         */
        public void setContent(String content) {
            this.content = content;
        }
    }
}
