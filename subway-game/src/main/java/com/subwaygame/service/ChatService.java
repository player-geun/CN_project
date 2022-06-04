package com.subwaygame.service;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
=======
>>>>>>> geun
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
<<<<<<< HEAD
@Slf4j
=======
>>>>>>> geun
public class ChatService {

    private ArrayList<String> subwayList = new ArrayList<>();

    public Boolean checkDuplicate(String parsedMsg) {
        for (String subway : subwayList) {
<<<<<<< HEAD
            if (subway.equals(parsedMsg)) {
                log.info("중복 발생");
=======
            if (subway == parsedMsg) {
>>>>>>> geun
                return true;
            }
        }

        subwayList.add(parsedMsg);

        return false;
    }
}
