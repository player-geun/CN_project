package com.subwaygame.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
public class ChatService {

    private ArrayList<String> subwayList = new ArrayList<>();

    public Boolean checkDuplicate(String parsedMsg) {
        for (String subway : subwayList) {
            if (subway == parsedMsg) {
                return true;
            }
        }

        subwayList.add(parsedMsg);

        return false;
    }
}
