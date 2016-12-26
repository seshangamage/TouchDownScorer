package ruger.touch.sheshan.com.touchdownscorer.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.List;

import ruger.touch.sheshan.com.touchdownscorer.handlers.MatchHandler;
import ruger.touch.sheshan.com.touchdownscorer.handlers.TeamHandler;
import ruger.touch.sheshan.com.touchdownscorer.model.Player;

/**
 * Created by sheshan on 12/25/16.
 */

public class JsonTest {


    public static List<Player> setTeamPlayers(String teamName){
        String tstName = "Royal College";
        ObjectMapper mapper = new ObjectMapper();
        if(teamName.equals(tstName)){
            try {
                List<Player> list = mapper.readValue(teamAplayerJson,
                        TypeFactory.defaultInstance().constructCollectionType(List.class,
                                Player.class));
                return list;
            }catch (Exception e){
                return null;
            }
        }
        else{
            try {
                List<Player> list = mapper.readValue(teamBplayerJson,
                        TypeFactory.defaultInstance().constructCollectionType(List.class,
                                Player.class));
                return list;
            }catch (Exception e){
                return null;
            }

        }
    }




    private static String teamAplayerJson = "\t[\n" +
            "\t\t{\"player_no\":1,\"name\":\"jhon\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":2,\"name\":\"Morn\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":3,\"name\":\"Torn\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":4,\"name\":\"Warn\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":5,\"name\":\"Jack\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":6,\"name\":\"Jill\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":7,\"name\":\"Brown\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":8,\"name\":\"Harris\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" }\n" +
            "\t]";


    private static String teamBplayerJson = "\t[\n" +
            "\t\t{\"player_no\":11,\"name\":\"Hello\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":12,\"name\":\"Mello\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":13,\"name\":\"March\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":14,\"name\":\"Rog\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":15,\"name\":\"Hog\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":16,\"name\":\"Nog\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":17,\"name\":\"Pog\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" },\n" +
            "\t\t{\"player_no\":18,\"name\":\"Puf\" ,\"height\":1.78 ,\"weight\":65.6,\"positionNo\":1,\"imageUrl\":\"www.googlw.com\" }\n" +
            "\t]";
}
