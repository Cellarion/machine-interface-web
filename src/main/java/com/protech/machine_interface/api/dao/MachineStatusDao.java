package com.protech.machine_interface.api.dao;

import com.protech.machine_interface.api.models.MachineStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineStatusDao extends JpaRepository<MachineStatus, Long> {
}
