/*
 * (c) Copyright 2009 Talis Information Ltd.
 * All rights reserved.
 * [See end of file]
 */

package org.openjena.sesamejena;

import org.openjena.sesamejena.impl.GraphModel;
import org.openrdf.model.Graph;
import org.openrdf.model.ValueFactory;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Class to enable the use of OpenRDF Sesame interfaces to access Jena models
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 *
 */
public class SesameJena
{
    /**
     * Creates a Sesame Graph wrapper around a Jena Model.
     * 
     * This makes it possible to access the Jena Model using any of the Graph interface methods, including the Collection<Statement> methods
     * 
     * @param factory The Sesame ValueFactory to use when creating Sesame Values from Jena Nodes.
     * @param model A Jena Model to wrap.
     * @return A Sesame Graph that can be used to access the given Jena Model.
     */
    public static Graph createGraph(ValueFactory factory, Model model)
    {
        return new GraphModel(factory, model);
    }
}

/*
 * (c) Copyright 2009 Talis Information Ltd.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */