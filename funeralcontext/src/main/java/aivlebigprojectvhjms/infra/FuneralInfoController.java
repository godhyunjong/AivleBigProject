package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/funeralInfos")
@Transactional
public class FuneralInfoController {

    @Autowired
    FuneralInfoRepository funeralInfoRepository;

    @RequestMapping(
        value = "/funeralInfos/{id}/resistfuneralinfo",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FuneralInfo resistFuneralInfo(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /funeralInfo/resistFuneralInfo  called #####"
        );
        Optional<FuneralInfo> optionalFuneralInfo = funeralInfoRepository.findById(
            id
        );

        optionalFuneralInfo.orElseThrow(() -> new Exception("No Entity Found"));
        FuneralInfo funeralInfo = optionalFuneralInfo.get();
        funeralInfo.resistFuneralInfo();

        funeralInfoRepository.save(funeralInfo);
        return funeralInfo;
    }
}
//>>> Clean Arch / Inbound Adaptor
