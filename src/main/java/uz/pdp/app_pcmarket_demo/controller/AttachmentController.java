package uz.pdp.app_pcmarket_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.app_pcmarket_demo.entity.Attachment;
import uz.pdp.app_pcmarket_demo.payload.Result;
import uz.pdp.app_pcmarket_demo.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController(value = "/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attechmentService;


    @PostMapping(value = "/upload")
    public Result uploadFile(MultipartHttpServletRequest request) throws IOException {
        return attechmentService.uploadAttachment(request);

    }


    @GetMapping(value = "/info")
    public List<Attachment> getInfo(){
        return attechmentService.getAttachment();
    }

    @GetMapping(value = "/info{id}")
    public Attachment getAttachmentInfo(@PathVariable Integer id){

        return attechmentService.getAttachmentById(id);
    }

    @GetMapping(value = "/download/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attechmentService.downloadAttachment(id, response);
    }

}
