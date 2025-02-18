package ss20_furama.service;

import ss20_furama.model.Facility;


import java.util.List;

public interface IFacilityService extends IService<Facility>{
    List<Facility> facilityMaintenance();
}
