package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class CarnetDomain {
    private UUID id;
    private Long numeroCarnet;

    private CarnetDomain(final UUID id, final Long numeroCarnet) {
        setId(id);
        setNumeroCarnet(numeroCarnet);
    }

    public static CarnetDomain build(final UUID id, final Long numeroCarnet) {
        return new CarnetDomain(id, numeroCarnet);
    }
    
    public static CarnetDomain build(final UUID id) {
        return new CarnetDomain(id, 0L);
    }
    
    public static CarnetDomain build() {
        return new CarnetDomain(UUIDHelper.getDefault(), 0L);
    }

    private final void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    private final void setNumeroCarnet(Long numeroCarnet) {
        this.numeroCarnet = numeroCarnet == null ? 0L : numeroCarnet;
    }

    public UUID getId() {
        return id;
    }

    public Long getNumeroCarnet() {
        return numeroCarnet;
    }
}
