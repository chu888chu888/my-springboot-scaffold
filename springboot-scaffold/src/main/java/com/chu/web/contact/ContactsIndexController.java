package com.chu.web.contact;

import com.chu.domain.contact.ContactRequest;
import com.chu.domain.contact.ContactRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by P70 on 2016/12/6.
 */

@RequestMapping("/contacts")
@Controller
public class ContactsIndexController {

    @RequestMapping
    public String index(ContactRequest contactRequest) {
        return "contacts/index";
    }


}
