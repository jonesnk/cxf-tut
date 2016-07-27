package com.jonesnk.org.service;

import com.jonesnk.org.generated.PlayerListType;
import com.jonesnk.org.generated.PlayerType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/playerservice")
public interface PlayerService {

    // Basic CRUD operations for Player Service

    // http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/addplayer
    @POST
    @Path("addplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String createOrSaveNewPLayerInfo(PlayerType playerType);

    // http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/getplayer/564
    @GET
    @Path("getplayer/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerType getPlayerInfo(@PathParam("id") int playerId);

    // http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/updateplayer
    @PUT
    @Path("updateplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String updatePlayerInfo(PlayerType playerType);

    // http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/deleteplayer
    @DELETE
    @Path("deleteplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String deletePlayerInfo(PlayerType playerType);

    // http://localhost:8080/ApacheCXF-JSON-IO/services/playerservice/getallplayer
    @GET
    @Path("getallplayer")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerListType getAllPlayerInfo();
}
