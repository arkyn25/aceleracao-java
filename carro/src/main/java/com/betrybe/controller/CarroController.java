package com.betrybe.controller;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.betrybe.dto.AtualizarCarroDTO;
import com.betrybe.dto.CriarCarroDTO;
import com.betrybe.model.Carro;
import com.betrybe.service.CarroService;

@Path("/carro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarroController {

  @Inject
  private CarroService service;

  @GET
  public List<Carro> listar() {
    return service.listar();
  }

  @GET
  @Path("/{id}")
  public Carro buscarPorId(@PathParam("id") Long id) {
    return service.buscarPorId(id);
  }

  @POST
  public void salvar(CriarCarroDTO carroDTO) {
    service.salvar(carroDTO);
  }

  @PATCH
  @Path("/{id}")
  public void atualizar(@PathParam("id") Long id, AtualizarCarroDTO carroDTO) {
    service.atualizar(carroDTO, id);
  }

  @DELETE
  @Path("/{id}")
  public void deletar(@PathParam("id") Long id) {
    service.deletar(id);
  }

}
