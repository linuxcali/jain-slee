/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.CSLocationInformation;
import net.java.slee.resource.diameter.sh.events.avp.userdata.PSLocationInformation;
import net.java.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShData;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShIMSData;


/**
 * <p>Java class for tSh-Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSh-Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicIdentifiers" type="{}tPublicIdentity" minOccurs="0"/>
 *         &lt;element name="RepositoryData" type="{}tTransparentData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sh-IMS-Data" type="{}tShIMSData" minOccurs="0"/>
 *         &lt;element name="CSLocationInformation" type="{}tCSLocationInformation" minOccurs="0"/>
 *         &lt;element name="PSLocationInformation" type="{}tPSLocationInformation" minOccurs="0"/>
 *         &lt;element name="CSUserState" type="{}tCSUserState" minOccurs="0"/>
 *         &lt;element name="PSUserState" type="{}tPSUserState" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tSh-Data-Extension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSh-Data", propOrder = {
    "publicIdentifiers",
    "repositoryData",
    "shIMSData",
    "csLocationInformation",
    "psLocationInformation",
    "csUserState",
    "psUserState",
    "extension",
    "any"
})
public class TShData implements ShData {

    @XmlElement(name = "PublicIdentifiers")
    protected PublicIdentity publicIdentifiers;
    @XmlElement(name = "RepositoryData")
    protected List<TTransparentData> repositoryData;
    @XmlElement(name = "Sh-IMS-Data")
    protected ShIMSData shIMSData;
    @XmlElement(name = "CSLocationInformation")
    protected CSLocationInformation csLocationInformation;
    @XmlElement(name = "PSLocationInformation")
    protected PSLocationInformation psLocationInformation;
    @XmlElement(name = "CSUserState")
    protected Short csUserState;
    @XmlElement(name = "PSUserState")
    protected Short psUserState;
    @XmlElement(name = "Extension")
    protected ShDataExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getPublicIdentifiers()
     */
    public PublicIdentity getPublicIdentifiers() {
        return publicIdentifiers;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setPublicIdentifiers(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity)
     */
    public void setPublicIdentifiers(PublicIdentity value) {
        this.publicIdentifiers = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getRepositoryData()
     */
    public List<TTransparentData> getRepositoryData() {
        if (repositoryData == null) {
            repositoryData = new ArrayList<TTransparentData>();
        }
        return this.repositoryData;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getShIMSData()
     */
    public ShIMSData getShIMSData() {
        return shIMSData;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setShIMSData(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TShIMSData)
     */
    public void setShIMSData(ShIMSData value) {
        this.shIMSData = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getCSLocationInformation()
     */
    public CSLocationInformation getCSLocationInformation() {
        return csLocationInformation;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setCSLocationInformation(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.CSLocationInformation)
     */
    public void setCSLocationInformation(CSLocationInformation value) {
        this.csLocationInformation = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getPSLocationInformation()
     */
    public PSLocationInformation getPSLocationInformation() {
        return psLocationInformation;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setPSLocationInformation(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PSLocationInformation)
     */
    public void setPSLocationInformation(PSLocationInformation value) {
        this.psLocationInformation = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getCSUserState()
     */
    public Short getCSUserState() {
        return csUserState;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setCSUserState(java.lang.Short)
     */
    public void setCSUserState(Short value) {
        this.csUserState = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getPSUserState()
     */
    public Short getPSUserState() {
        return psUserState;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setPSUserState(java.lang.Short)
     */
    public void setPSUserState(Short value) {
        this.psUserState = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getExtension()
     */
    public ShDataExtension getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TShDataExtension)
     */
    public void setExtension(ShDataExtension value) {
        this.extension = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShData#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}