/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.jboss.as.console.client.mbui.cui.reification.pipeline;

import com.google.gwt.user.client.ui.Widget;
import org.jboss.as.console.client.mbui.aui.aim.InteractionUnit;
import org.jboss.as.console.client.mbui.cui.reification.ReificationWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harald Pehl
 * @date 10/30/2012
 */
public class TestableReificationWidget implements ReificationWidget
{
    final InteractionUnit interactionUnit;
    final List<ReificationWidget> children;

    public TestableReificationWidget(final InteractionUnit interactionUnit)
    {
        this.interactionUnit = interactionUnit;
        this.children = new ArrayList<ReificationWidget>();
    }

    @Override
    public void add(final ReificationWidget widget, final InteractionUnit interactionUnit, final InteractionUnit parent)
    {
        children.add(widget);
    }

    @Override
    public Widget asWidget()
    {
        return null;
    }
}