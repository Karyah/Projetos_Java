package dominio;

import javax.persistence.Embeddable;

@Embeddable
public enum EnumDeficiencia {
	FISICA, AUDITIVA, INTELECTUAL, PSICOSSOCIAL, NENHUMA;
}
