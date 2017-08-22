/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Collection;

//import datos.PacienteDAO;
//import modelo.PacienteDTO;
//
//import datos.ConsultaDAO;
//import modelo.ConsultaDTO;
//
//import datos.AlcoholDAO;
//import modelo.AlcoholDTO;
//
//import datos.FumarDAO;
//import modelo.FumarDTO;
//
//import datos.FebrilDAO;
//import modelo.FebrilDTO;
//
//import datos.ViralDAO;
//import modelo.ViralDTO;
//
//import datos.RespuestaSiNoDAO;
//import modelo.RespuestaSiNoDTO;
//
//import datos.RespuestanmDAO;
//import modelo.RespuestanmDTO;
//
//import datos.PeriodoDAO;
//import modelo.PeriodoDTO;
//
//import datos.FaseDAO;
//import modelo.FaseDTO;
//
//import datos.DatosClinicosDAO;
//import modelo.DatosClinicosDTO;
//
//import datos.SemanaDAO;
//import modelo.SemanaDTO;
//
//import datos.EnfermedadesDAO;
//import modelo.EnfermedadesDTO;
//
//import datos.DatosClinicosDetDAO;
//import modelo.DatosClinicosDetDTO;
//
//import datos.DolorSemanaDAO;
//import java.util.ArrayList;
//import modelo.DolorSemanaDTO;
import datos.ConsultaDAO;

import datos.usuariosDAO;
import modelo.UsuariosDTO;


/**
 *
 * @author SChaves
 */
public class Fachada {
    private boolean errorB;
  private String errorStr;

  public Fachada() {
    errorB = false;
    errorStr = "";
  }
  
  
     
  /**
   *
   * @return Collection type AlcoholDTO
   */
//  public Collection<PacienteDTO> obtenerPaciente() {
//    PacienteDAO pacienteDAO = new PacienteDAO();
//    return pacienteDAO.selectPaciente();
//  }
//  
//  
//  //***** CONSULTA
//   public Collection<ConsultaDTO> obtenerConsulta() {
//    ConsultaDAO consultaDAO = new ConsultaDAO();
//    return consultaDAO.selectConsulta();
//  }
//   
//  public ConsultaDTO obtenerConsultaPaciente(String Id) {
//    ConsultaDAO consultaDAO = new ConsultaDAO();
//    ConsultaDTO query = new ConsultaDTO();
//    query =consultaDAO.selectConsultaPaciente(Id);
//    errorB = consultaDAO.getErrorB();
//    errorStr = consultaDAO.getErrorStr();
//    return query;
//  }        
//  
//  public int obtenerLastIdConsulta() {
//    ConsultaDAO consultaDAO = new ConsultaDAO();
//    int kNo = 0;
//    kNo =consultaDAO.selectLastIdConsulta();
//    //errorB = consultaDAO.getErrorB();
//    //errorStr = consultaDAO.getErrorStr();
//    return kNo;
//  } 
//
//  public int obtenerIdConsulta(String Id) {
//    ConsultaDAO consultaDAO = new ConsultaDAO();
//    int kNo = 0;
//    kNo =consultaDAO.selectAskExisteConsulta(Id);
//    //errorB = consultaDAO.getErrorB();
//    //errorStr = consultaDAO.getErrorStr();
//    return kNo;
//  }   
//  
//   /**
//   *
//   * @param  type DepartamentoDTO
//   * @return boolean true si se agrega
//   */
//  public boolean agregarConsulta(ConsultaDTO cons) {
//    boolean ksal;
//    ConsultaDAO consDAO = new ConsultaDAO();
//    ksal=consDAO.insertConsulta(cons);
//    errorB=consDAO.getErrorB();
//    errorStr=consDAO.getErrorStr();
//    return !errorB;
//  }
//
//    
//  
//  /**
//   *
//   * @return Collection type AlcoholDTO
//   */
//  public Collection<AlcoholDTO> obtenerAlcohol() {
//    AlcoholDAO departamentoDAO = new AlcoholDAO();
//    return departamentoDAO.selectAlcohol();
//  }
//  
//    
//  /**
//   *
//   * @return Collection type AlcoholDTO
//   */
//  public Collection<FumarDTO> obtenerFumar() {
//    FumarDAO fumar = new FumarDAO();
//    return fumar.selectFumar();
//  }
//  
//  // RespuestaSINO
//  
//   /**
//   *
//   * @return Collection type AlcoholDTO
//   */
//  public Collection<RespuestaSiNoDTO> obtenerRespuestaSiNo() {
//    RespuestaSiNoDAO respuesta = new RespuestaSiNoDAO();
//    return respuesta.selectRespuestaSN();
//  }
//  
//  // RespuestaNM
//  
//   /**
//   *
//   * @return Collection type 
//   */
//  public Collection<RespuestanmDTO> obtenerRespuestaNM() {
//    RespuestanmDAO respuesta = new RespuestanmDAO();
//    return respuesta.selectRespuestaNM();
//  }    
// // Periodo enfermedad
//  
//   /**
//   *
//   * @return Collection type 
//   */
//  public Collection<PeriodoDTO> obtenerPeriodo() {
//    PeriodoDAO periodo = new PeriodoDAO();
//    return periodo.selectPeriodo();
//  }  
//  
//  
//   public Collection<FaseDTO> obtenerFase() {
//    FaseDAO fase = new FaseDAO();
//    return fase.selectFase();
//  }   
//
// public Collection<SemanaDTO> obtenerSemana() {
//    SemanaDAO semana = new SemanaDAO();
//    return semana.selectSemana();
//  }      
//  //FEBRIL
//  
//   public FebrilDTO obtenerFebrilConsulta(Integer Id) {
//    FebrilDAO febrilDAO = new FebrilDAO();
//    FebrilDTO query = new FebrilDTO();
//    query =febrilDAO.selectFebrilConsulta(Id);
//    errorB = febrilDAO.getErrorB();
//    errorStr = febrilDAO.getErrorStr();
//    return query;
//  }        
//
//     //VIRAL
//  
//   public ViralDTO obtenerViralConsulta(Integer Id) {
//    ViralDAO viralDAO = new ViralDAO();
//    ViralDTO query = new ViralDTO();
//    query =viralDAO.selectViralConsulta(Id);
//    errorB = viralDAO.getErrorB();
//    errorStr = viralDAO.getErrorStr();
//    return query;
//  }
//   
//       //ENFERMEDADES
//  
//   public EnfermedadesDTO obtenerEnfermedadesConsulta(Integer Id) {
//    EnfermedadesDAO efermedadDAO = new EnfermedadesDAO();
//    EnfermedadesDTO query = new EnfermedadesDTO();
//    query =efermedadDAO.selectEnfermedadesConsulta(Id);
//    errorB = efermedadDAO.getErrorB();
//    errorStr = efermedadDAO.getErrorStr();
//    return query;
//  } 
//   // DATOS CLINICOS
//    public DatosClinicosDTO obtenerDatosClinicosConsulta(Integer Id, Integer IdPeriodo) {
//    DatosClinicosDAO datos = new DatosClinicosDAO();
//    DatosClinicosDTO query = new DatosClinicosDTO();
//    query =datos.selectDatosClinicosConsulta(Id, IdPeriodo);
//    errorB = datos.getErrorB();
//    errorStr = datos.getErrorStr();
//    return query;
//  } 
//
//   // SIGNOS DOLOR    
//    public Collection<DatosClinicosDetDTO> obtenerSignosConsulta(Integer Id) {
//    DatosClinicosDetDAO signos = new DatosClinicosDetDAO();
//    //DolorSemanaDTO query = new DolorSemanaDTO();
//    //ArrayList<DolorSemanaDTO> query = new ArrayList<DolorSemanaDTO>();
//    Collection query = signos.selectSignosConsulta(Id);
//    errorB = signos.getErrorB();
//    errorStr = signos.getErrorStr();
//    return query;
//  }        
//    
//   // DOLOR SEMANA
//     public Collection<DolorSemanaDTO> obtenerDolorSemanaConsulta(Integer Id, Integer IdSemana, Integer IdDolor) {
//        DolorSemanaDAO dolor = new DolorSemanaDAO();
//        //DolorSemanaDTO query = new DolorSemanaDTO();
//        //ArrayList<DolorSemanaDTO> query = new ArrayList<DolorSemanaDTO>();
//        Collection query = dolor.selectDolorSemana(Id, IdSemana,IdDolor);
//        errorB = dolor.getErrorB();
//        errorStr = dolor.getErrorStr();
//        return query;
//      }         
//
//    public int obtenerNoRegDolorSemana(Integer Id, Integer IdSemana) {
//        DolorSemanaDAO dolor = new DolorSemanaDAO();       
//        int query = dolor.selectAskNoRegDolorSemana(Id, IdSemana);
//        errorB = dolor.getErrorB();
//        errorStr = dolor.getErrorStr();
//        return query;
//      }       
//   

// USUARIOS
  public boolean registrarUsuario(UsuariosDTO us){
      ConsultaDAO con = new ConsultaDAO();
      return con.registrarUsuario(us);
  }
  
  public boolean autenticarUsuario(UsuariosDTO us){
      ConsultaDAO con = new ConsultaDAO();
      return con.autenticacionUsuario(us); 
  }
  
  
  
  
  
  
    /**
   * Devuelve la variable de errror "booleana"
   *
   * @author barce
   * @version CRUD basico v 1.0.
   * @since desde la versión 1.8 del JDK/SDK
   */
  public boolean getErrorB() {
    return errorB;
  }

  /**
   * Devuelve la variable de errror "string"
   *
   * @author barce
   * @version CRUD basico v 1.0.
   * @since desde la versión 1.8 del JDK/SDK
   */
  public String getErrorStr() {
    return errorStr;
  }
  
}
