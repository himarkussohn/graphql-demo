package com.graphql.demo;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.servlet.SimpleGraphQLHttpServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLHttpServlet {

    private GraphQLEndpoint() {
        super(SchemaParser.newParser()
                .file("schema.graphqls")
                .build()
                .makeExecutableSchema());
    }
}
