/*
package org.example;

import javax.swing.text.html.Option;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonJDBCDao implements DAO<Person> {
    @Override
    public Person save(Person obj) {
        try (Connection connection = ConnectionsManager.getConnection()) {
            String SAVE_QUERY = "INSERT INTO persons (name) values (?)";
            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(SAVE_QUERY, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, obj.getName());
                preparedStatement.executeUpdate();

                ResultSet resultObj = preparedStatement.getGeneratedKeys();
                if (resultObj.next()) {
                    obj.setId(resultObj.getLong("id"));
                }
                return obj;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Person update(Person obj) {
        try (Connection connection = ConnectionsManager.getConnection()) {
            String UPDATE_QUERY = "UPDATE persons SET name = ? WHERE id = ?";
            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(UPDATE_QUERY)) {
                preparedStatement.setString(1, obj.getName());
                preparedStatement.setLong(2, obj.getId());
                int changedRows = preparedStatement.executeUpdate();
                if (changedRows == 1) {
                    return obj;
                } else {
                    throw new RuntimeException("cannot update user");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Person> get(Long id) {
        try (Connection connection = ConnectionsManager.getConnection()) {
            String GET_QUERY = "SELECT * FROM persons where id = ?";
            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(GET_QUERY)) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return Optional.of(Person.builder().id(resultSet.getLong("id"))
                            .name(resultSet.getString("name")).build());
                } else {
                    return Optional.empty();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Long id) {
        try (Connection connection = ConnectionsManager.getConnection()) {
            String DELETE_QUERY = "DELETE FROM persons where id = ?";
            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(DELETE_QUERY)) {
                preparedStatement.setLong(1, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Person> getALl() {
        try (Connection connection = ConnectionsManager.getConnection()) {
            List<Person> resultList = new ArrayList<>();
            String SAVE_QUERY = "SELECT * FROM persons";
            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(SAVE_QUERY)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    resultList.add(
                            Person.builder().name(resultSet.getString("age"))
                                    .id(resultSet.getLong("id"))
                                    .build()
                    );
                }
                return resultList;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
*/
