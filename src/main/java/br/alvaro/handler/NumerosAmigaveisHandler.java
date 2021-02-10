package br.alvaro.handler;

import br.alvaro.NumerosAmigaveisFacade;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

public class NumerosAmigaveisHandler implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String,String> input, Context context) {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");

        Integer x = Integer.parseInt(input.get("x"));
        Integer y = Integer.parseInt(input.get("y"));

        String jsonInString = String.valueOf(new NumerosAmigaveisFacade().seNumerosSaoAMigaveis(x,y));

        return jsonInString;
    }
}
