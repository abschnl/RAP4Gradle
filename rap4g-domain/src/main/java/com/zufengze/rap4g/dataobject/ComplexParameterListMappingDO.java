package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ComplexParameterListMappingDO implements Serializable {

    private static final long serialVersionUID = -6150214489419748898L;

    /** 主键ID. */
    private Long              id;

    /** 复合参数ID. */
    private Long              complexParameterId;

    /** 参数ID. */
    private Long              parameterId;

    /**
     * id.
     *
     * @return the id
     * @since JDK 1.6
     */
    public Long getId() {
        return id;
    }

    /**
     * id.
     *
     * @param id the id to set
     * @since JDK 1.6
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * complexParameterId.
     *
     * @return the complexParameterId
     * @since JDK 1.6
     */
    public Long getComplexParameterId() {
        return complexParameterId;
    }

    /**
     * complexParameterId.
     *
     * @param complexParameterId the complexParameterId to set
     * @since JDK 1.6
     */
    public void setComplexParameterId(Long complexParameterId) {
        this.complexParameterId = complexParameterId;
    }

    /**
     * parameterId.
     *
     * @return the parameterId
     * @since JDK 1.6
     */
    public Long getParameterId() {
        return parameterId;
    }

    /**
     * parameterId.
     *
     * @param parameterId the parameterId to set
     * @since JDK 1.6
     */
    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ComplexParameterListMappingDO [id=");
        builder.append(id);
        builder.append(", complexParameterId=");
        builder.append(complexParameterId);
        builder.append(", parameterId=");
        builder.append(parameterId);
        builder.append("]");
        return builder.toString();
    }

}
