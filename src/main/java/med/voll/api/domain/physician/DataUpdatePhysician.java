package med.voll.api.domain.physician;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address2.AddressData;

public record DataUpdatePhysician(@NotNull Long id, String name, String document, AddressData addressData) {

}
